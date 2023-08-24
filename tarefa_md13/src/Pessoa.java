public class Pessoa {
    void nome() {
        System.out.println("nome Alan");
    }

    public class Pessoajuridica extends Pessoa {


        @Override
        void nome() {
            super.nome();
        }

        void EmpresadeComercio() {
            System.out.println("Vende Produtos.");
        }

    }

    public class PessoaFisica extends Pessoa {


        @Override
        void nome() {
            super.nome();
        }

        void Cidadãolegal() {
            System.out.println("Tem seus direitos.");
        }
    }


}
