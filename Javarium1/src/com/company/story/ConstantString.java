package com.company.story;

import com.sun.javafx.binding.StringFormatter;

public class ConstantString {
    public final static String WELCOME = "Привет, я программа создающая персон и записываю и удалю их с файла!";
    public final static String ENTER_FILE_NAME = "Введите имя файла с расширением";
    public final static String CREATE = "Create";
    public final static String READ = "Read";
    public final static String UPDATE = "Update";
    public final static String DELETE = "Delete";

    public final static String CREATE_COMMAND = "Команда " + CREATE + " создает новую персону и добавляет в файл если он существует.";
    public final static String READ_COMMAND = "Команда " + READ + " выводит содержимое файла.";
    public final static String UPDATE_COMMAND = "Команда " + UPDATE + " ";
    public final static String DELETE_COMMAND = "Команда " + DELETE + " удаляет одну персону";


    public final static String START = "Start";
    public final static String HELP = "Help";
    public final static String SWITCH = "Switch";
    public final static String EXIT = "Exit";

    public final static String EXIT_COMMAND = "После команды Exit осуществляется выход из приложения.";
    public final static String START_COMMAND = "После команды Start выполняется сохранение измененных данных.";
    public final static String HELP_COMMAND = "После команды Help осуществляется вывод доступных команд и их формат.";
    public final static String SWITCH_COMMAND = "После команды Switch осуществляется возврат в главное меню";

    public final static String ID = "id";

    public final static String firstName = "First Name";
    public final static String lastName = "Last Name";
    public final static String AGE = "Age";
    private String city;
}
