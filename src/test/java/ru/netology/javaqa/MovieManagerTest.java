package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testAddSingleMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFiveMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-Невидимка");

        String[] expected = { "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперед","Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-Невидимка");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-Невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMaxLimitMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-Невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-Невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testLastFourMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");

        String[] expected = { "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLimit() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-Невидимка");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-Невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
