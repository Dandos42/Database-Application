package BUT.FEKT.IBE.BDS.Database_Cinema.database;

import javafx.beans.property.*;

public class InjectionsAttacksView {

    private final IntegerProperty id_employee = new SimpleIntegerProperty();
    private final StringProperty first_name = new SimpleStringProperty();
    private final StringProperty last_name = new SimpleStringProperty();
    private final StringProperty username = new SimpleStringProperty();

    //Gettery for list of films
    public Integer getId_employee() {return id_employeeProperty().get();}

    public String getFirst_name() {return first_nameProperty().get();}

    public String getLast_name() {return last_nameProperty().get();}

    public String getUsername() {return usernameProperty().get();}

    //Settery for list of films
    public void setId_employee(int id_employee) {this.id_employee.set(id_employee);}

    public void setLast_name(String last_name)
    {
        this.last_name.set(last_name);
    }

    public void setFirst_name(String first_name)
    {
        this.first_name.set(first_name);
    }

    public void setUsername(String username)
    {
        this.username.set(username);
    }

    //properties
    public IntegerProperty id_employeeProperty() {return id_employee;}

    public StringProperty first_nameProperty() {return first_name;}

    public StringProperty last_nameProperty() {return last_name;}

    public StringProperty usernameProperty() {return username;}
}
