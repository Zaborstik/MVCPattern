package src.view;

import src.controller.Controller;
import src.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);}
