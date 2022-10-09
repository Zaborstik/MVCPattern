package src.view;


import src.bean.User;
import src.controller.Controller;
import src.model.ModelData;

public class UsersView implements View{
    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for (User user: modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }
}
