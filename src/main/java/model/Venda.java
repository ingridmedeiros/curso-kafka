package model;

import java.math.BigDecimal;

public class Venda {
    private Long operacao;
    private Long cliente;
    private Integer quantidadeIngressos;
    private BigDecimal valorTotal;
    private String status;

    public Venda() {

    }
    
    public Venda(Long operacao, Long cliente, Integer quantidadeIngressos, BigDecimal valorTotal) {
        this.operacao = operacao;
        this.cliente = cliente;
        this.quantidadeIngressos = quantidadeIngressos;
        this.valorTotal = valorTotal;
    }

    /**
     * @return Long return the operacao
     */
    public Long getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(Long operacao) {
        this.operacao = operacao;
    }

    /**
     * @return Long return the cliente
     */
    public Long getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    /**
     * @return Integer return the quantidadeIngressos
     */
    public Integer getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    /**
     * @param quantidadeIngressos the quantidadeIngressos to set
     */
    public void setQuantidadeIngressos(Integer quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

    /**
     * @return BigDecimal return the valorTotal
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda [operacao=" + operacao + ", cliente=" + cliente + ", quantidadeIngressos=" + quantidadeIngressos +
               ", valorTotal=" + valorTotal + ", status=" + status + "]";
    }
}
