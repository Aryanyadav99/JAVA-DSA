package projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener {
    private static final int TILE_SIZE = 20;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_TILES_X = WIDTH / TILE_SIZE;
    private static final int NUM_TILES_Y = HEIGHT / TILE_SIZE;

    private ArrayList<Point> snake;
    private Point food;
    private char direction;
    private boolean running;
    private Timer timer;

    public SnakeGame() {
        snake = new ArrayList<>();
        snake.add(new Point(NUM_TILES_X / 2, NUM_TILES_Y / 2));
        direction = 'R';
        running = true;
        spawnFood();

        timer = new Timer(100, this);
        timer.start();

        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (direction != 'D') direction = 'U';
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') direction = 'D';
                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') direction = 'L';
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') direction = 'R';
                        break;
                    case KeyEvent.VK_R:
                        if (!running) restart();
                        break;
                }
            }
        });
    }

    private void spawnFood() {
        Random rand = new Random();
        ArrayList<Point> availablePositions = new ArrayList<>();
    
        // Collect all available positions within the grid bounds
        for (int x = 0; x < NUM_TILES_X; x++) {
            for (int y = 0; y < NUM_TILES_Y; y++) {
                Point p = new Point(x, y);
                if (!snake.contains(p)) {
                    availablePositions.add(p);
                }
            }
        }
    
        // If there are available positions, pick one randomly
        if (!availablePositions.isEmpty()) {
            food = availablePositions.get(rand.nextInt(availablePositions.size()));
        } else {
            // Handle the case where no positions are available
            // For example, you could end the game or restart
            running = false; // End the game if no positions are available
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (running) {
            g.setColor(Color.RED);
            g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        } else {
            showGameOver(g);
        }
        Toolkit.getDefaultToolkit().sync();
    }

    private void showGameOver(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Game Over!", WIDTH / 3, HEIGHT / 3);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Press R to Restart", WIDTH / 3, HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
        }
        repaint();
    }

    private void move() {
        Point head = snake.get(0);
        Point newHead = new Point(head);

        switch (direction) {
            case 'U':
                newHead.y--;
                break;
            case 'D':
                newHead.y++;
                break;
            case 'L':
                newHead.x--;
                break;
            case 'R':
                newHead.x++;
                break;
        }

        snake.add(0, newHead);
        if (newHead.equals(food)) {
            spawnFood();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);
        if (head.x < 0 || head.x >= NUM_TILES_X || head.y < 0 || head.y >= NUM_TILES_Y) {
            running = false;
        }
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
            }
        }
    }

    public void restart() {
        snake.clear();
        snake.add(new Point(NUM_TILES_X / 2, NUM_TILES_Y / 2));
        direction = 'R';
        running = true;
        spawnFood();
        timer.restart();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}