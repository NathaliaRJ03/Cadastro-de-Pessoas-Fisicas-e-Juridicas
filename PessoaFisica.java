package material.polimorfismo;
public class PessoaFisica extends Pessoa {
	protected String nome;
	protected String cpf;
    protected String sobrenome;
    protected String nomedamãe;
    protected String bairro;
    protected String estado;
    protected String cep;
    protected String uf;
    protected String datadenascimento;
    protected String telefone;
    

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf ) {
        this.cpf = cpf;
    }

    public String getnome() {
    	return nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
	}
    

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomedamãe() {
		return nomedamãe;
	}

	public void setNomedamãe(String nomedamãe) {
		this.nomedamãe = nomedamãe;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
