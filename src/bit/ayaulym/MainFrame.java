package bit.ayaulym;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private FirstPage firstPage;
    private SecondPage secondPage;

    private Students[] students = {
            new Students("Cristiano Ronaldo", 120000000, "Juventus"),
            new Students("Eden Hazard", 100000000, "Real Madrid"),
            new Students("Leo Messi", 140000000, "Barcelona"),
            new Students("Kylian Mbappe", 190000000, "PSG"),
            new Students("Neymar Jr", 160000000, "PSG")
    };

    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }
}