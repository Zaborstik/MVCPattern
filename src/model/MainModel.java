package src.model;


import src.model.service.UserService;
import src.model.service.UserServiceImpl;

public class MainModel implements Model{
    private
    UserService userService = new UserServiceImpl();
    private ModelData modelData = new ModelData();

    @Override
    public void loadUsers(){
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }
}
