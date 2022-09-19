package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static final int COUNT_ENGINE = 2;

    private String name;

    public void Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        System.out.println("The model: " + name);
    }

    public void printCountEngine() {
        if (!name.equals("A380")) {
            System.out.println("The number of engines is: " + COUNT_ENGINE);
        } else {
            System.out.println("The number of engines is: " + 4);
        }
    }

        @Override
        public String toString () {
            return "Airbus{"
                    + "name='" + name + '\''
                    + '}';
        }
}