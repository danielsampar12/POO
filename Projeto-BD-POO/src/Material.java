/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author mfelipe
 */
public class Material implements Serializable {
    
    private String titulo;
    private String ano_producao;
    private String ano_publicacao;
    private String edicao;
    private String paginas;
    private String url_disponivel;
    private String isbn;
    private String issn;
    private String material;
    private int cd_divulgacao;
    private int cd_editora;
    private int cd_entidade;
    private int cd_local_publicacao;
    private int cd_tipo_organizacao;
    private int cd_autor;
    private int cd_palavras_chaves;
    
    public Material() {
    }
    
    public void criarObjetos() {
    	
    	
    }
    
    public Material(String titulo, String ano_producao, String ano_publicacao, String edicao, String paginas, String url_disponivel, String isbn, String issn, String material, int cd_divulgacao, int cd_editora, int cd_entidade, int cd_local_publicacao, int cd_tipo_organizacao, int cd_autor, int cd_palavras_chaves) {
        this.setTitulo(titulo);
        this.setAno_producao(ano_producao);
        this.setAno_publicacao(ano_publicacao);
        this.setEdicao(edicao);
        this.setPaginas(paginas);
        this.setUrl_disponivel(url_disponivel);
        this.setIsbn(isbn);
        this.setIssn(issn);
        this.setMaterial(material);
        this.setCd_divulgacao(cd_divulgacao);
        this.setCd_editora(cd_editora);
        this.setCd_entidade(cd_entidade);
        this.setCd_local_publicacao(cd_local_publicacao);
        this.setCd_tipo_organizacao(cd_tipo_organizacao);
        this.setCd_autor(cd_autor);
        this.setCd_palavras_chaves(cd_palavras_chaves);
    }
    
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAno_producao(String ano_producao) {
        this.ano_producao = ano_producao;
    }
    
    public void setAno_publicacao(String ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
    
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
    
    public void setUrl_disponivel(String url_disponivel) {
        this.url_disponivel = url_disponivel;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void setIssn(String issn) {
        this.issn = issn;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void setCd_divulgacao(int cd_divulgacao) {
        this.cd_divulgacao = cd_divulgacao;
    }
    
    public void setCd_editora(int cd_editora) {
        this.cd_editora = cd_editora;
    }
    
    public void setCd_entidade(int cd_entidade) {
        this.cd_entidade = cd_entidade;
    }
    
    public void setCd_local_publicacao(int cd_local_publicacao) {
        this.cd_local_publicacao = cd_local_publicacao;
    }
    
    public void setCd_tipo_organizacao(int cd_tipo_organizacao) {
        this.cd_tipo_organizacao = cd_tipo_organizacao;
    }
    
    public void setCd_autor(int cd_autor) {
        this.cd_autor = cd_autor;
    }
    
    public void setCd_palavras_chaves(int cd_palavras_chaves) {
        this.cd_palavras_chaves = cd_palavras_chaves;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAno_producao() {
        return ano_producao;
    }
    
    public String getAno_publicacao() {
        return ano_publicacao;
    }
    
    public String getEdicao() {
        return edicao;
    }
    
    public String getPaginas() {
        return paginas;
    }
    
    public String getUrl_disponivel() {
        return url_disponivel;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getIssn() {
        return issn;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public int getCd_divulgacao() {
        return cd_divulgacao;
    }
    
    public int getCd_editora() {
        return cd_editora;
    }
    
    public int getCd_entidade() {
        return cd_entidade;
    }
    
    public int getCd_local_publicacao() {
        return cd_local_publicacao;
    }
    
    public int getCd_tipo_organizacao() {
        return cd_tipo_organizacao;
    }
    
    public int getCd_autor() {
        return cd_autor;
    }
    
    public int getCd_palavras_chaves() {
        return cd_palavras_chaves;
    }
    
}
