package Domain;

import java.util.Objects;

public class Client {
    private String name;
    private Long cpf;
    private Long tel;
    private String address;
    private Integer homeNumber;
    private String city;
    private String state;

    public Client(String nome, String cpf, String tel, String end, String num, String cidade, String estado) {
        this.name = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.address = end;
        this.homeNumber = Integer.valueOf(num.trim());
        this.city = cidade;
        this.state = estado;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer gethomeNumber() {
        return homeNumber;
    }

    public void sethomeNumber(Integer telNumber) {
        this.homeNumber = telNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return cpf == client.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Domain.Client{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                '}';
    }

}
