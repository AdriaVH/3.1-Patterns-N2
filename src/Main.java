import classes.Address;
import classes.Agenda;
import classes.ContactDetails;
import classes.Contact;
import model.ContactListFactory;
import factories.UKContactListFactory;

public class Main {
    public static void main(String[] args) {
        Agenda sergisAgenda = new Agenda();
        Contact adria = new Contact("Adria", "Vargas");
        ContactListFactory britishContactListFactory = new UKContactListFactory();

        ContactDetails detailsAdria = britishContactListFactory.createContactDetails("075018862");
        Address addressAdria = britishContactListFactory.createAddress("10",
                                 "London Bridge Road",
                                    "12B",
                                      "London",
                                        "City of London",
                                          "England",
                                            "SE9TL");

    adria.addInfo(addressAdria,detailsAdria);
    sergisAgenda.addContact(adria);
    sergisAgenda.addContact(adria);
    sergisAgenda.displayContactsName();
    }

}