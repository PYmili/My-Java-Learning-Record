package InnerClass.src.ProgrammingLanguage;

public class ProgrammingLanguage {
    String name;
    public class Developer {
        String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void info() {
            System.out.println("Developer name: " + this.name);
        }
    }
    Developer developer = new Developer();

    public ProgrammingLanguage(String name, String developerName) {
        this.name = name;
        this.developer.setName(developerName);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Programming language name: " + getName());
        developer.info();
    }
}
