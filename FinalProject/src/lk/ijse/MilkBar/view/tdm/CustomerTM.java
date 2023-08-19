package lk.ijse.MilkBar.view.tdm;



public class CustomerTM implements Comparable<CustomerTM> {
    private String id;
    private String name;
    private String address;
    private String contact;

    public CustomerTM() {
    }

    public CustomerTM(String id, String name, String address, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.setContact(contact);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }


    @Override
    public int compareTo(CustomerTM o) {
        return id.compareTo(o.getId());
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
