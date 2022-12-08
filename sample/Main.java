package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    public static final int BALL_RADIUS = 15;
    public static final int PADDLE_WIDTH = 25;
    public static final int PADDLE_HEIGHT = 100;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(17), e-> run(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
        primaryStage.setScene(new Scene(new StackPane(canvas)));
        primaryStage.show();
        tl.play();

        //Линия
       /* Line line = new Line(WINDOW_WIDTH/2, 0, WINDOW_WIDTH/2, WINDOW_HEIGHT);
        line.setStroke(Color.ORANGE);
        line.setStrokeWidth(5);

        //Мяч
        Circle ball = new Circle(WINDOW_WIDTH/2, WINDOW_HEIGHT/2, BALL_RADIUS);
        ball.setFill(Color.WHITE);

        //ракетки для игры
            //левая
        Rectangle leftPaddle = new Rectangle(PADDLE_WIDTH*1.5,PADDLE_HEIGHT);
        leftPaddle.setX(PADDLE_WIDTH*1.5);
        leftPaddle.setY((WINDOW_HEIGHT - PADDLE_HEIGHT)/2);
        leftPaddle.setFill(Color.WHITE);
            //правая
        Rectangle rightPaddle = new Rectangle(PADDLE_WIDTH,PADDLE_HEIGHT);
        rightPaddle.setX(WINDOW_WIDTH - 2*PADDLE_WIDTH);
        rightPaddle.setY((WINDOW_HEIGHT - PADDLE_HEIGHT)/2);

        //Создание группы
        Group group = new Group(line, ball, leftPaddle, rightPaddle);
        //group.getChildren().add(ball);

        //Создание сцены
        Scene scene = new Scene(group, WINDOW_WIDTH, WINDOW_HEIGHT);

        //настройка цвета сцены
        scene.setFill(Color.BROWN);

        //Установка заголовка для сцены
        primaryStage.setTitle("Sample Application");

        //Добавление сцены в рабочую область
        primaryStage.setScene(scene);

        //Отображение содержимого сцены
        primaryStage.show(); */
    }
    private void run(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0,WINDOW_WIDTH,WINDOW_HEIGHT);
        gc.setFill(Color.WHITE);

        gc.setFill(Color.WHITE);
        gc.fillRect(WINDOW_WIDTH/2-2,0,4,WINDOW_HEIGHT);

    }
        public static void main(String args[]){
        launch(args);
        }
}
