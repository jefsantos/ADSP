//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.01.18 às 01:54:56 PM BRST 
//


package br.gov.model.resumoFolha;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoDocumento_t.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
 *     &lt;enumeration value="Relação de Contratos de Concessão e Permissão de Serviço Público"/>
 *     &lt;enumeration value="Mapa de Precatórios"/>
 *     &lt;enumeration value="Fixação da Remuneração de Agentes Políticos"/>
 *     &lt;enumeration value="Concessão de Reajuste de Agentes Políticos"/>
 *     &lt;enumeration value="Remuneração de Agentes Políticos"/>
 *     &lt;enumeration value="Complemento de Remuneração de Agentes Políticos"/>
 *     &lt;enumeration value="Dados de Balanços Isolados"/>
 *     &lt;enumeration value="Dados de Balanços Consolidados"/>
 *     &lt;enumeration value="Dados de Balanços Conjuntos"/>
 *     &lt;enumeration value="Conciliações Bancárias"/>
 *     &lt;enumeration value="Complemento de Conciliações Bancárias"/>
 *     &lt;enumeration value="Conciliações Bancárias Mensais"/>
 *     &lt;enumeration value="Relatório de Atividades"/>
 *     &lt;enumeration value="Complemento de Relatório de Atividades"/>
 *     &lt;enumeration value="Cadastro de Fundos de Investimento"/>
 *     &lt;enumeration value="Fundos de Investimento"/>
 *     &lt;enumeration value="Atos Normativos"/>
 *     &lt;enumeration value="Cargos"/>
 *     &lt;enumeration value="Funções"/>
 *     &lt;enumeration value="Quadro de Pessoal"/>
 *     &lt;enumeration value="Agente Público"/>
 *     &lt;enumeration value="Lotação Agente Público"/>
 *     &lt;enumeration value="Cadastro de Verbas Remuneratórias"/>
 *     &lt;enumeration value="Folha Ordinária"/>
 *     &lt;enumeration value="Pagamento de Folha Ordinária"/>
 *     &lt;enumeration value="Folha Suplementar"/>
 *     &lt;enumeration value="Resumo Mensal da Folha de Pagamento"/>
 *     &lt;enumeration value="Cadastro de Aposentados e Pensionistas"/>
 *     &lt;enumeration value="Cadastro de Verbas Remuneratórias - SEFAZ"/>
 *     &lt;enumeration value="Folha Ordinária - SEFAZ"/>
 *     &lt;enumeration value="Pagamento de Folha Ordinária - SEFAZ"/>
 *     &lt;enumeration value="Folha Suplementar - SEFAZ"/>
 *     &lt;enumeration value="Resumo Mensal da Folha de Pagamento - SEFAZ"/>
 *     &lt;enumeration value="Cadastro de Aposentados e Pensionistas - SEFAZ"/>
 *     &lt;enumeration value="Cadastro de Municípios - SEFAZ"/>
 *     &lt;enumeration value="Cadastro de Entidades - SEFAZ"/>
 *     &lt;enumeration value="Questionário sobre Transporte"/>
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
    RELAÇÃO_DE_CONTRATOS_DE_CONCESSÃO_E_PERMISSÃO_DE_SERVIÇO_PÚBLICO("Rela\u00e7\u00e3o de Contratos de Concess\u00e3o e Permiss\u00e3o de Servi\u00e7o P\u00fablico"),
    @XmlEnumValue("Mapa de Precat\u00f3rios")
    MAPA_DE_PRECATÓRIOS("Mapa de Precat\u00f3rios"),
    @XmlEnumValue("Fixa\u00e7\u00e3o da Remunera\u00e7\u00e3o de Agentes Pol\u00edticos")
    FIXAÇÃO_DA_REMUNERAÇÃO_DE_AGENTES_POLÍTICOS("Fixa\u00e7\u00e3o da Remunera\u00e7\u00e3o de Agentes Pol\u00edticos"),
    @XmlEnumValue("Concess\u00e3o de Reajuste de Agentes Pol\u00edticos")
    CONCESSÃO_DE_REAJUSTE_DE_AGENTES_POLÍTICOS("Concess\u00e3o de Reajuste de Agentes Pol\u00edticos"),
    @XmlEnumValue("Remunera\u00e7\u00e3o de Agentes Pol\u00edticos")
    REMUNERAÇÃO_DE_AGENTES_POLÍTICOS("Remunera\u00e7\u00e3o de Agentes Pol\u00edticos"),
    @XmlEnumValue("Complemento de Remunera\u00e7\u00e3o de Agentes Pol\u00edticos")
    COMPLEMENTO_DE_REMUNERAÇÃO_DE_AGENTES_POLÍTICOS("Complemento de Remunera\u00e7\u00e3o de Agentes Pol\u00edticos"),
    @XmlEnumValue("Dados de Balan\u00e7os Isolados")
    DADOS_DE_BALANÇOS_ISOLADOS("Dados de Balan\u00e7os Isolados"),
    @XmlEnumValue("Dados de Balan\u00e7os Consolidados")
    DADOS_DE_BALANÇOS_CONSOLIDADOS("Dados de Balan\u00e7os Consolidados"),
    @XmlEnumValue("Dados de Balan\u00e7os Conjuntos")
    DADOS_DE_BALANÇOS_CONJUNTOS("Dados de Balan\u00e7os Conjuntos"),
    @XmlEnumValue("Concilia\u00e7\u00f5es Banc\u00e1rias")
    CONCILIAÇÕES_BANCÁRIAS("Concilia\u00e7\u00f5es Banc\u00e1rias"),
    @XmlEnumValue("Complemento de Concilia\u00e7\u00f5es Banc\u00e1rias")
    COMPLEMENTO_DE_CONCILIAÇÕES_BANCÁRIAS("Complemento de Concilia\u00e7\u00f5es Banc\u00e1rias"),
    @XmlEnumValue("Concilia\u00e7\u00f5es Banc\u00e1rias Mensais")
    CONCILIAÇÕES_BANCÁRIAS_MENSAIS("Concilia\u00e7\u00f5es Banc\u00e1rias Mensais"),
    @XmlEnumValue("Relat\u00f3rio de Atividades")
    RELATÓRIO_DE_ATIVIDADES("Relat\u00f3rio de Atividades"),
    @XmlEnumValue("Complemento de Relat\u00f3rio de Atividades")
    COMPLEMENTO_DE_RELATÓRIO_DE_ATIVIDADES("Complemento de Relat\u00f3rio de Atividades"),
    @XmlEnumValue("Cadastro de Fundos de Investimento")
    CADASTRO_DE_FUNDOS_DE_INVESTIMENTO("Cadastro de Fundos de Investimento"),
    @XmlEnumValue("Fundos de Investimento")
    FUNDOS_DE_INVESTIMENTO("Fundos de Investimento"),
    @XmlEnumValue("Atos Normativos")
    ATOS_NORMATIVOS("Atos Normativos"),
    @XmlEnumValue("Cargos")
    CARGOS("Cargos"),
    @XmlEnumValue("Fun\u00e7\u00f5es")
    FUNÇÕES("Fun\u00e7\u00f5es"),
    @XmlEnumValue("Quadro de Pessoal")
    QUADRO_DE_PESSOAL("Quadro de Pessoal"),
    @XmlEnumValue("Agente P\u00fablico")
    AGENTE_PÚBLICO("Agente P\u00fablico"),
    @XmlEnumValue("Lota\u00e7\u00e3o Agente P\u00fablico")
    LOTAÇÃO_AGENTE_PÚBLICO("Lota\u00e7\u00e3o Agente P\u00fablico"),
    @XmlEnumValue("Cadastro de Verbas Remunerat\u00f3rias")
    CADASTRO_DE_VERBAS_REMUNERATÓRIAS("Cadastro de Verbas Remunerat\u00f3rias"),
    @XmlEnumValue("Folha Ordin\u00e1ria")
    FOLHA_ORDINÁRIA("Folha Ordin\u00e1ria"),
    @XmlEnumValue("Pagamento de Folha Ordin\u00e1ria")
    PAGAMENTO_DE_FOLHA_ORDINÁRIA("Pagamento de Folha Ordin\u00e1ria"),
    @XmlEnumValue("Folha Suplementar")
    FOLHA_SUPLEMENTAR("Folha Suplementar"),
    @XmlEnumValue("Resumo Mensal da Folha de Pagamento")
    RESUMO_MENSAL_DA_FOLHA_DE_PAGAMENTO("Resumo Mensal da Folha de Pagamento"),
    @XmlEnumValue("Cadastro de Aposentados e Pensionistas")
    CADASTRO_DE_APOSENTADOS_E_PENSIONISTAS("Cadastro de Aposentados e Pensionistas"),
    @XmlEnumValue("Cadastro de Verbas Remunerat\u00f3rias - SEFAZ")
    CADASTRO_DE_VERBAS_REMUNERATÓRIAS_SEFAZ("Cadastro de Verbas Remunerat\u00f3rias - SEFAZ"),
    @XmlEnumValue("Folha Ordin\u00e1ria - SEFAZ")
    FOLHA_ORDINÁRIA_SEFAZ("Folha Ordin\u00e1ria - SEFAZ"),
    @XmlEnumValue("Pagamento de Folha Ordin\u00e1ria - SEFAZ")
    PAGAMENTO_DE_FOLHA_ORDINÁRIA_SEFAZ("Pagamento de Folha Ordin\u00e1ria - SEFAZ"),
    @XmlEnumValue("Folha Suplementar - SEFAZ")
    FOLHA_SUPLEMENTAR_SEFAZ("Folha Suplementar - SEFAZ"),
    @XmlEnumValue("Resumo Mensal da Folha de Pagamento - SEFAZ")
    RESUMO_MENSAL_DA_FOLHA_DE_PAGAMENTO_SEFAZ("Resumo Mensal da Folha de Pagamento - SEFAZ"),
    @XmlEnumValue("Cadastro de Aposentados e Pensionistas - SEFAZ")
    CADASTRO_DE_APOSENTADOS_E_PENSIONISTAS_SEFAZ("Cadastro de Aposentados e Pensionistas - SEFAZ"),
    @XmlEnumValue("Cadastro de Munic\u00edpios - SEFAZ")
    CADASTRO_DE_MUNICÍPIOS_SEFAZ("Cadastro de Munic\u00edpios - SEFAZ"),
    @XmlEnumValue("Cadastro de Entidades - SEFAZ")
    CADASTRO_DE_ENTIDADES_SEFAZ("Cadastro de Entidades - SEFAZ"),
    @XmlEnumValue("Question\u00e1rio sobre Transporte")
    QUESTIONÁRIO_SOBRE_TRANSPORTE("Question\u00e1rio sobre Transporte"),
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
