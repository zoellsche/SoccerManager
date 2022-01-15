public class APP {

    public static void main(String[] args) {

        System.out.println("Start");

        coach c = new coach();
        c.setName("Peter");
        c.setExperience();

        System.out.println(c.getExperience());

        System.out.println(c.getName());

        System.out.println(c.getExperience());

        System.out.println("Ende");


    }
}
