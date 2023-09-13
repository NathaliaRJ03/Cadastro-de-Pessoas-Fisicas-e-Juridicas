package material.polimorfismo;
public class PessoaJuridica extends Pessoa {
	protected String nome;
	protected String sobrenome;
	protected String cnpj;
	protected String cpf;
	protected String nomedamãe;
	protected String bairro;
	protected String estado;
	protected String cep;
	protected String uf;
	protected String datadenascimento;
	protected String telefone;
	protected String nomedaempresa;
	protected String datadesituacaocadastral;
	protected String situacaocadastral;
	protected String codigoatividadeeconomica;
	protected String codigonaturezajuridica;


    public PessoaJuridica() {
    }

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getNomedaempresa() {
		return nomedaempresa;
	}

	public void setNomedaempresa(String nomedaempresa) {
		this.nomedaempresa = nomedaempresa;
	}

	public String getDatadesituacaocadastral() {
		return datadesituacaocadastral;
	}

	public void setDatadesituacaocadastral(String datadesituacaocadastral) {
		this.datadesituacaocadastral = datadesituacaocadastral;
	}

	public String getSituacaocadastral() {
		return situacaocadastral;
	}

	public void setSituacaocadastral(String situacaocadastral) {
		this.situacaocadastral = situacaocadastral;
	}

	public String getCodigoatividadeeconomica() {
		return codigoatividadeeconomica;
	}

	public void setCodigoatividadeeconomica(String codigoatividadeeconomica) {
		this.codigoatividadeeconomica = codigoatividadeeconomica;
	}

	public String getCodigonaturezajuridica() {
		return codigonaturezajuridica;
	}

	public void setCodigonaturezajuridica(String codigonaturezajuridica) {
		this.codigonaturezajuridica = codigonaturezajuridica;
		
	}
	 public String getnome() {
	    	return nome;
	 }

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
}
