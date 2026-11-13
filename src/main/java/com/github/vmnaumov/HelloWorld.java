package com.github.vmnaumov;

import io.qt.widgets.QApplication;
import io.qt.widgets.QLabel;

public class HelloWorld {

    public static void main(String[] args) {
        // Инициализируем QApplication
        QApplication.initialize(args);

        // Создаем виджет с текстом
        QLabel label = new QLabel("Hello, World!");
        label.resize(250, 100);
        label.setWindowTitle("QtJambi Hello World");
        label.show();

        // Запускаем цикл обработки событий Qt
        QApplication.exec();

        // Завершаем работу QtJambi
        QApplication.shutdown();
    }
}
