import Controllers.*;
import Views.MainMenu;

public class Main {

//    private ClientController clientController = new ClientController();
    private final ProjetController projetController = new ProjetController();
    private QuoteController quoteController = new QuoteController();
//    private ComponentController componentController = new ComponentController();
//    private MaterialController materialController = new MaterialController();
//    private LaborController laborController = new LaborController();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int option;

        while (true) {
            option = MainMenu.displayMenu();
            if (option == 5) {
                System.out.println("Exit");
                break;
            }
            handleOption(option);
            System.out.println();
        }
    }

    private void handleOption(int option) {
        switch (option) {
            case 1 -> projetController.createNewProjet();
            case 2 -> projetController.displayProjets();
            case 3 -> projetController.showProjetById();
            case 4 -> quoteController.viewAllQuotes();
        }
    }
}
