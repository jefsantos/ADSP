//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.18 �s 01:54:56 PM BRST 
//


package br.gov.model.resumoFolha;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoDocumento_t.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDocumento_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CADASTROS-CONTABEIS"/>
 *     &lt;enumeration value="PLAN-CADASTRO"/>
 *     &lt;enumeration value="PLAN-LDO-INICIAL"/>
 *     &lt;enumeration value="PLAN-LOA-INICIAL"/>
 *     &lt;enumeration value="PLAN-PPA-INICIAL"/>
 *     &lt;enumeration value="PLAN-LDO-ATUALIZADA"/>
 *     &lt;enumeration value="PLAN-LOA-ATUALIZADA"/>
 *     &lt;enumeration value="PLAN-PPA-ATUALIZADO"/>
 *     &lt;enumeration value="BALANCETE-ISOLADO-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-ISOLADO-CONTA-CONTABIL"/>
 *     &lt;enumeration value="BALANCETE-CONJUNTO-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-CONJUNTO-CONTA-CONTABIL"/>
 *     &lt;enumeration value="BALANCETE-CONSOLIDADO-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-CONSOLIDADO-CONTA-CONTABIL"/>
 *     &lt;enumeration value="BALANCETE-ISOLADO-ENCERRAMENTO-13-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-ISOLADO-ENCERRAMENTO-13-CONTA-CONTABIL"/>
 *     &lt;enumeration value="BALANCETE-CONJUNTO-ENCERRAMENTO-13-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-CONJUNTO-ENCERRAMENTO-13-CONTA-CONTABIL"/>
 *     &lt;enumeration value="BALANCETE-ISOLADO-ENCERRAMENTO-14-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-ISOLADO-ENCERRAMENTO-14-CONTA-CONTABIL"/>
 *     &lt;enumeration value="BALANCETE-CONJUNTO-ENCERRAMENTO-14-CONTA-CORRENTE"/>
 *     &lt;enumeration value="BALANCETE-CONJUNTO-ENCERRAMENTO-14-CONTA-CONTABIL"/>
 *     &lt;enumeration value="Rela��o de Contratos de Concess�o e Permiss�o de Servi�o P�blico"/>
 *     &lt;enumeration value="Mapa de Precat�rios"/>
 *     &lt;enumeration value="Fixa��o da Remunera��o de Agentes Pol�ticos"/>
 *     &lt;enumeration value="Concess�o de Reajuste de Agentes Pol�ticos"/>
 *     &lt;enumeration value="Remunera��o de Agentes Pol�ticos"/>
 *     &lt;enumeration value="Complemento de Remunera��o de Agentes Pol�ticos"/>
 *     &lt;enumeration value="Dados de Balan�os Isolados"/>
 *     &lt;enumeration value="Dados de Balan�os Consolidados"/>
 *     &lt;enumeration value="Dados de Balan�os Conjuntos"/>
 *     &lt;enumeration value="Concilia��es Banc�rias"/>
 *     &lt;enumeration value="Complemento de Concilia��es Banc�rias"/>
 *     &lt;enumeration value="Concilia��es Banc�rias Mensais"/>
 *     &lt;enumeration value="Relat�rio de Atividades"/>
 *     &lt;enumeration value="Complemento de Relat�rio de Atividades"/>
 *     &lt;enumeration value="Cadastro de Fundos de Investimento"/>
 *     &lt;enumeration value="Fundos de Investimento"/>
 *     &lt;enumeration value="Atos Normativos"/>
 *     &lt;enumeration value="Cargos"/>
 *     &lt;enumeration value="Fun��es"/>
 *     &lt;enumeration value="Quadro de Pessoal"/>
 *     &lt;enumeration value="Agente P�blico"/>
 *     &lt;enumeration value="Lota��o Agente P�blico"/>
 *     &lt;enumeration value="Cadastro de Verbas Remunerat�rias"/>
 *     &lt;enumeration value="Folha Ordin�ria"/>
 *     &lt;enumeration value="Pagamento de Folha Ordin�ria"/>
 *     &lt;enumeration value="Folha Suplementar"/>
 *     &lt;enumeration value="Resumo Mensal da Folha de Pagamento"/>
 *     &lt;enumeration value="Cadastro de Aposentados e Pensionistas"/>
 *     &lt;enumeration value="Cadastro de Verbas Remunerat�rias - SEFAZ"/>
 *     &lt;enumeration value="Folha Ordin�ria - SEFAZ"/>
 *     &lt;enumeration value="Pagamento de Folha Ordin�ria - SEFAZ"/>
 *     &lt;enumeration value="Folha Suplementar - SEFAZ"/>
 *     &lt;enumeration value="Resumo Mensal da Folha de Pagamento - SEFAZ"/>
 *     &lt;enumeration value="Cadastro de Aposentados e Pensionistas - SEFAZ"/>
 *     &lt;enumeration value="Cadastro de Munic�pios - SEFAZ"/>
 *     &lt;enumeration value="Cadastro de Entidades - SEFAZ"/>
 *     &lt;enumeration value="Question�rio sobre Transporte"/>
 *     &lt;enumeration value="LICITACAO-REGISTRO-PRECOS-SIM-TODAS-MODALIDADES"/>
 *     &lt;enumeration value="LICITACAO-REGISTRO-PRECOS-NAO-TODAS-MODALIDADES-MENOS-INTERNACIONAL"/>
 *     &lt;enumeration value="LICITACAO-REGISTRO-PRECOS-NAO-INTERNACIONAL"/>
 *     &lt;enumeration value="LICITACAO-REGISTRO-PRECOS-NAO-CONTRATACAO-DIRETA"/>
 *     &lt;enumeration value="EMPENHO"/>
 *     &lt;enumeration value="EXECUCAO"/>
 *     &lt;enumeration value="TERMOADITIVO"/>
 *     &lt;enumeration value="AJUSTE"/>
 *     &lt;enumeration value="DOCUMENTO-FISCAL"/>
 *     &lt;enumeration value="EXIGENCIAS-OBRAS"/>
 *     &lt;enumeration value="PAGAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumento_t")
@XmlEnum
public enum TipoDocumentoT {

    @XmlEnumValue("CADASTROS-CONTABEIS")
    CADASTROS_CONTABEIS("CADASTROS-CONTABEIS"),
    @XmlEnumValue("PLAN-CADASTRO")
    PLAN_CADASTRO("PLAN-CADASTRO"),
    @XmlEnumValue("PLAN-LDO-INICIAL")
    PLAN_LDO_INICIAL("PLAN-LDO-INICIAL"),
    @XmlEnumValue("PLAN-LOA-INICIAL")
    PLAN_LOA_INICIAL("PLAN-LOA-INICIAL"),
    @XmlEnumValue("PLAN-PPA-INICIAL")
    PLAN_PPA_INICIAL("PLAN-PPA-INICIAL"),
    @XmlEnumValue("PLAN-LDO-ATUALIZADA")
    PLAN_LDO_ATUALIZADA("PLAN-LDO-ATUALIZADA"),
    @XmlEnumValue("PLAN-LOA-ATUALIZADA")
    PLAN_LOA_ATUALIZADA("PLAN-LOA-ATUALIZADA"),
    @XmlEnumValue("PLAN-PPA-ATUALIZADO")
    PLAN_PPA_ATUALIZADO("PLAN-PPA-ATUALIZADO"),
    @XmlEnumValue("BALANCETE-ISOLADO-CONTA-CORRENTE")
    BALANCETE_ISOLADO_CONTA_CORRENTE("BALANCETE-ISOLADO-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-ISOLADO-CONTA-CONTABIL")
    BALANCETE_ISOLADO_CONTA_CONTABIL("BALANCETE-ISOLADO-CONTA-CONTABIL"),
    @XmlEnumValue("BALANCETE-CONJUNTO-CONTA-CORRENTE")
    BALANCETE_CONJUNTO_CONTA_CORRENTE("BALANCETE-CONJUNTO-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-CONJUNTO-CONTA-CONTABIL")
    BALANCETE_CONJUNTO_CONTA_CONTABIL("BALANCETE-CONJUNTO-CONTA-CONTABIL"),
    @XmlEnumValue("BALANCETE-CONSOLIDADO-CONTA-CORRENTE")
    BALANCETE_CONSOLIDADO_CONTA_CORRENTE("BALANCETE-CONSOLIDADO-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-CONSOLIDADO-CONTA-CONTABIL")
    BALANCETE_CONSOLIDADO_CONTA_CONTABIL("BALANCETE-CONSOLIDADO-CONTA-CONTABIL"),
    @XmlEnumValue("BALANCETE-ISOLADO-ENCERRAMENTO-13-CONTA-CORRENTE")
    BALANCETE_ISOLADO_ENCERRAMENTO_13_CONTA_CORRENTE("BALANCETE-ISOLADO-ENCERRAMENTO-13-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-ISOLADO-ENCERRAMENTO-13-CONTA-CONTABIL")
    BALANCETE_ISOLADO_ENCERRAMENTO_13_CONTA_CONTABIL("BALANCETE-ISOLADO-ENCERRAMENTO-13-CONTA-CONTABIL"),
    @XmlEnumValue("BALANCETE-CONJUNTO-ENCERRAMENTO-13-CONTA-CORRENTE")
    BALANCETE_CONJUNTO_ENCERRAMENTO_13_CONTA_CORRENTE("BALANCETE-CONJUNTO-ENCERRAMENTO-13-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-CONJUNTO-ENCERRAMENTO-13-CONTA-CONTABIL")
    BALANCETE_CONJUNTO_ENCERRAMENTO_13_CONTA_CONTABIL("BALANCETE-CONJUNTO-ENCERRAMENTO-13-CONTA-CONTABIL"),
    @XmlEnumValue("BALANCETE-ISOLADO-ENCERRAMENTO-14-CONTA-CORRENTE")
    BALANCETE_ISOLADO_ENCERRAMENTO_14_CONTA_CORRENTE("BALANCETE-ISOLADO-ENCERRAMENTO-14-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-ISOLADO-ENCERRAMENTO-14-CONTA-CONTABIL")
    BALANCETE_ISOLADO_ENCERRAMENTO_14_CONTA_CONTABIL("BALANCETE-ISOLADO-ENCERRAMENTO-14-CONTA-CONTABIL"),
    @XmlEnumValue("BALANCETE-CONJUNTO-ENCERRAMENTO-14-CONTA-CORRENTE")
    BALANCETE_CONJUNTO_ENCERRAMENTO_14_CONTA_CORRENTE("BALANCETE-CONJUNTO-ENCERRAMENTO-14-CONTA-CORRENTE"),
    @XmlEnumValue("BALANCETE-CONJUNTO-ENCERRAMENTO-14-CONTA-CONTABIL")
    BALANCETE_CONJUNTO_ENCERRAMENTO_14_CONTA_CONTABIL("BALANCETE-CONJUNTO-ENCERRAMENTO-14-CONTA-CONTABIL"),
    @XmlEnumValue("Rela\u00e7\u00e3o de Contratos de Concess\u00e3o e Permiss\u00e3o de Servi\u00e7o P\u00fablico")
    RELA��O_DE_CONTRATOS_DE_CONCESS�O_E_PERMISS�O_DE_SERVI�O_P�BLICO("Rela\u00e7\u00e3o de Contratos de Concess\u00e3o e Permiss\u00e3o de Servi\u00e7o P\u00fablico"),
    @XmlEnumValue("Mapa de Precat\u00f3rios")
    MAPA_DE_PRECAT�RIOS("Mapa de Precat\u00f3rios"),
    @XmlEnumValue("Fixa\u00e7\u00e3o da Remunera\u00e7\u00e3o de Agentes Pol\u00edticos")
    FIXA��O_DA_REMUNERA��O_DE_AGENTES_POL�TICOS("Fixa\u00e7\u00e3o da Remunera\u00e7\u00e3o de Agentes Pol\u00edticos"),
    @XmlEnumValue("Concess\u00e3o de Reajuste de Agentes Pol\u00edticos")
    CONCESS�O_DE_REAJUSTE_DE_AGENTES_POL�TICOS("Concess\u00e3o de Reajuste de Agentes Pol\u00edticos"),
    @XmlEnumValue("Remunera\u00e7\u00e3o de Agentes Pol\u00edticos")
    REMUNERA��O_DE_AGENTES_POL�TICOS("Remunera\u00e7\u00e3o de Agentes Pol\u00edticos"),
    @XmlEnumValue("Complemento de Remunera\u00e7\u00e3o de Agentes Pol\u00edticos")
    COMPLEMENTO_DE_REMUNERA��O_DE_AGENTES_POL�TICOS("Complemento de Remunera\u00e7\u00e3o de Agentes Pol\u00edticos"),
    @XmlEnumValue("Dados de Balan\u00e7os Isolados")
    DADOS_DE_BALAN�OS_ISOLADOS("Dados de Balan\u00e7os Isolados"),
    @XmlEnumValue("Dados de Balan\u00e7os Consolidados")
    DADOS_DE_BALAN�OS_CONSOLIDADOS("Dados de Balan\u00e7os Consolidados"),
    @XmlEnumValue("Dados de Balan\u00e7os Conjuntos")
    DADOS_DE_BALAN�OS_CONJUNTOS("Dados de Balan\u00e7os Conjuntos"),
    @XmlEnumValue("Concilia\u00e7\u00f5es Banc\u00e1rias")
    CONCILIA��ES_BANC�RIAS("Concilia\u00e7\u00f5es Banc\u00e1rias"),
    @XmlEnumValue("Complemento de Concilia\u00e7\u00f5es Banc\u00e1rias")
    COMPLEMENTO_DE_CONCILIA��ES_BANC�RIAS("Complemento de Concilia\u00e7\u00f5es Banc\u00e1rias"),
    @XmlEnumValue("Concilia\u00e7\u00f5es Banc\u00e1rias Mensais")
    CONCILIA��ES_BANC�RIAS_MENSAIS("Concilia\u00e7\u00f5es Banc\u00e1rias Mensais"),
    @XmlEnumValue("Relat\u00f3rio de Atividades")
    RELAT�RIO_DE_ATIVIDADES("Relat\u00f3rio de Atividades"),
    @XmlEnumValue("Complemento de Relat\u00f3rio de Atividades")
    COMPLEMENTO_DE_RELAT�RIO_DE_ATIVIDADES("Complemento de Relat\u00f3rio de Atividades"),
    @XmlEnumValue("Cadastro de Fundos de Investimento")
    CADASTRO_DE_FUNDOS_DE_INVESTIMENTO("Cadastro de Fundos de Investimento"),
    @XmlEnumValue("Fundos de Investimento")
    FUNDOS_DE_INVESTIMENTO("Fundos de Investimento"),
    @XmlEnumValue("Atos Normativos")
    ATOS_NORMATIVOS("Atos Normativos"),
    @XmlEnumValue("Cargos")
    CARGOS("Cargos"),
    @XmlEnumValue("Fun\u00e7\u00f5es")
    FUN��ES("Fun\u00e7\u00f5es"),
    @XmlEnumValue("Quadro de Pessoal")
    QUADRO_DE_PESSOAL("Quadro de Pessoal"),
    @XmlEnumValue("Agente P\u00fablico")
    AGENTE_P�BLICO("Agente P\u00fablico"),
    @XmlEnumValue("Lota\u00e7\u00e3o Agente P\u00fablico")
    LOTA��O_AGENTE_P�BLICO("Lota\u00e7\u00e3o Agente P\u00fablico"),
    @XmlEnumValue("Cadastro de Verbas Remunerat\u00f3rias")
    CADASTRO_DE_VERBAS_REMUNERAT�RIAS("Cadastro de Verbas Remunerat\u00f3rias"),
    @XmlEnumValue("Folha Ordin\u00e1ria")
    FOLHA_ORDIN�RIA("Folha Ordin\u00e1ria"),
    @XmlEnumValue("Pagamento de Folha Ordin\u00e1ria")
    PAGAMENTO_DE_FOLHA_ORDIN�RIA("Pagamento de Folha Ordin\u00e1ria"),
    @XmlEnumValue("Folha Suplementar")
    FOLHA_SUPLEMENTAR("Folha Suplementar"),
    @XmlEnumValue("Resumo Mensal da Folha de Pagamento")
    RESUMO_MENSAL_DA_FOLHA_DE_PAGAMENTO("Resumo Mensal da Folha de Pagamento"),
    @XmlEnumValue("Cadastro de Aposentados e Pensionistas")
    CADASTRO_DE_APOSENTADOS_E_PENSIONISTAS("Cadastro de Aposentados e Pensionistas"),
    @XmlEnumValue("Cadastro de Verbas Remunerat\u00f3rias - SEFAZ")
    CADASTRO_DE_VERBAS_REMUNERAT�RIAS_SEFAZ("Cadastro de Verbas Remunerat\u00f3rias - SEFAZ"),
    @XmlEnumValue("Folha Ordin\u00e1ria - SEFAZ")
    FOLHA_ORDIN�RIA_SEFAZ("Folha Ordin\u00e1ria - SEFAZ"),
    @XmlEnumValue("Pagamento de Folha Ordin\u00e1ria - SEFAZ")
    PAGAMENTO_DE_FOLHA_ORDIN�RIA_SEFAZ("Pagamento de Folha Ordin\u00e1ria - SEFAZ"),
    @XmlEnumValue("Folha Suplementar - SEFAZ")
    FOLHA_SUPLEMENTAR_SEFAZ("Folha Suplementar - SEFAZ"),
    @XmlEnumValue("Resumo Mensal da Folha de Pagamento - SEFAZ")
    RESUMO_MENSAL_DA_FOLHA_DE_PAGAMENTO_SEFAZ("Resumo Mensal da Folha de Pagamento - SEFAZ"),
    @XmlEnumValue("Cadastro de Aposentados e Pensionistas - SEFAZ")
    CADASTRO_DE_APOSENTADOS_E_PENSIONISTAS_SEFAZ("Cadastro de Aposentados e Pensionistas - SEFAZ"),
    @XmlEnumValue("Cadastro de Munic\u00edpios - SEFAZ")
    CADASTRO_DE_MUNIC�PIOS_SEFAZ("Cadastro de Munic\u00edpios - SEFAZ"),
    @XmlEnumValue("Cadastro de Entidades - SEFAZ")
    CADASTRO_DE_ENTIDADES_SEFAZ("Cadastro de Entidades - SEFAZ"),
    @XmlEnumValue("Question\u00e1rio sobre Transporte")
    QUESTION�RIO_SOBRE_TRANSPORTE("Question\u00e1rio sobre Transporte"),
    @XmlEnumValue("LICITACAO-REGISTRO-PRECOS-SIM-TODAS-MODALIDADES")
    LICITACAO_REGISTRO_PRECOS_SIM_TODAS_MODALIDADES("LICITACAO-REGISTRO-PRECOS-SIM-TODAS-MODALIDADES"),
    @XmlEnumValue("LICITACAO-REGISTRO-PRECOS-NAO-TODAS-MODALIDADES-MENOS-INTERNACIONAL")
    LICITACAO_REGISTRO_PRECOS_NAO_TODAS_MODALIDADES_MENOS_INTERNACIONAL("LICITACAO-REGISTRO-PRECOS-NAO-TODAS-MODALIDADES-MENOS-INTERNACIONAL"),
    @XmlEnumValue("LICITACAO-REGISTRO-PRECOS-NAO-INTERNACIONAL")
    LICITACAO_REGISTRO_PRECOS_NAO_INTERNACIONAL("LICITACAO-REGISTRO-PRECOS-NAO-INTERNACIONAL"),
    @XmlEnumValue("LICITACAO-REGISTRO-PRECOS-NAO-CONTRATACAO-DIRETA")
    LICITACAO_REGISTRO_PRECOS_NAO_CONTRATACAO_DIRETA("LICITACAO-REGISTRO-PRECOS-NAO-CONTRATACAO-DIRETA"),
    EMPENHO("EMPENHO"),
    EXECUCAO("EXECUCAO"),
    TERMOADITIVO("TERMOADITIVO"),
    AJUSTE("AJUSTE"),
    @XmlEnumValue("DOCUMENTO-FISCAL")
    DOCUMENTO_FISCAL("DOCUMENTO-FISCAL"),
    @XmlEnumValue("EXIGENCIAS-OBRAS")
    EXIGENCIAS_OBRAS("EXIGENCIAS-OBRAS"),
    PAGAMENTO("PAGAMENTO");
    private final String value;

    TipoDocumentoT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumentoT fromValue(String v) {
        for (TipoDocumentoT c: TipoDocumentoT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
