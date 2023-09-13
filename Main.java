package material.polimorfismo;
public class Main {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Cristiano");
        fisica.setBairro("Campo Grande");
        fisica.setCep("21782638");
        fisica.setSobrenome("Ribas");
        fisica.setCpf("456.654.675.07");
        fisica.setEstado("Rio de Janeiro");
        fisica.setTelefone("(21) 5667-7865");
        fisica.setNomedamãe("Aline");
        fisica.setUf("RJ");
        fisica.setDatadenascimento("18 de Agosto de 1998");
     

        PessoaJuridica juridica = new PessoaJuridica();
        juridica.setNome("Alana");
        juridica.setBairro("Madureira");
        juridica.setCep("67868987");
        juridica.setCnpj("567897888");
        juridica.setEstado("Rio de Janeiro");
        juridica.setNomedamãe("Claudia");
        juridica.setUf("RJ");
        juridica.setTelefone("(21) 6789-5432");
        juridica.setDatadenascimento("4 de Janeiro de 1977");
        juridica.setSobrenome("Oliveira");
        juridica.setNomedaempresa("Mercadinho da Família Oliveira");
        juridica.setSituacaocadastral("ATIVA");
        juridica.setDatadesituacaocadastral("04/08/2023");
        juridica.setCpf("823.867.645.09");
        juridica.setCodigoatividadeeconomica("56.99-7-05 - Treinamento em desenvolvimento profissional e gerencial");
        juridica.setCodigonaturezajuridica("98.97-9-02 - Treinamento em Estoque");

        Pessoa[] pessoas = new Pessoa[1];
        for(Pessoa pessoa : pessoas) {
        	
        	System.out.println ("---- PESSOA JURÍDICA: ----");
            System.out.println("Nome:" + juridica.getnome());
            System.out.println("Sobrenome:" + juridica.getNomedamãe());
            System.out.println("CPF:" + juridica.getCpf());
            System.out.println("Data de Nascimento:" + juridica.getDatadenascimento());
            System.out.println("Nome da mãe:" + juridica.getNomedamãe());
            System.out.println("Bairro:" + juridica.getBairro());
            System.out.println("CEP:" + juridica.getCep());
            System.out.println("CNPJ:" + juridica.getcnpj());
            System.out.println("Estado" + juridica.getEstado());
            System.out.println("UF:" + juridica.getUf());
            System.out.println("Telefone:" + juridica.getTelefone());
            System.out.println("Nome da Empresa:" + juridica.getNomedaempresa());
            System.out.println("Situação Cadastral:" + juridica.getSituacaocadastral());
            System.out.println("Data da Situação Cadastral" + juridica.getDatadesituacaocadastral());
            System.out.println("Código e Descrição da Natureza Jurídica:" + juridica.getCodigonaturezajuridica());
            System.out.println("Código e Declaração da Atividade Economica Principal:" + juridica.getCodigoatividadeeconomica());
            System.out.println ("\n \n ");
            System.out.println ("---- PESSOA FÍSICA: ----");
            System.out.println("Nome:" + fisica.getnome());
            System.out.println("Sobrenome:" + fisica.getSobrenome());
            System.out.println("CPF:" + fisica.getCpf());
            System.out.println("Data de Nascimento:" + fisica.getDatadenascimento());
            System.out.println("Nome da mãe:" + fisica.getNomedamãe());
            System.out.println("Bairro:" + fisica.getBairro());
            System.out.println("CEP:" + fisica.getCep());
            System.out.println("Estado" + fisica.getEstado());
            System.out.println("UF:" + fisica.getUf());
            System.out.println("Telefone:" + fisica.getTelefone());
          
        
        }
    }
}