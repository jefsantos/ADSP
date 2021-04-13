package br.gov.bean.folhaOrdinaria;

import br.gov.model.folhaOrdinaria.CPFComAtributoT;
import br.gov.model.folhaOrdinaria.CertidaoNascimentoComAtributoT;
import br.gov.model.folhaOrdinaria.ObjectFactory;
import br.gov.model.folhaOrdinaria.PISPASEPComAtributoT;
import br.gov.model.folhaOrdinaria.RGComAtributoT;

public class TipoDocumentoIdentificacaoIndividual {

	
	    private CPFComAtributo cpf;
	    private CertidaoNascimentoComAtributo certidaoNascimentoComAtributo;
	    private PISPASEPComAtributo pispasepComAtributo;
	    private RGComAtributo rgComAtributo;

	    public CPFComAtributo getCpf() {
			return cpf;
		}
	    public CPFComAtributoT getCpfT() {
	    	ObjectFactory obj = new ObjectFactory();
	    	CPFComAtributoT cpfT = obj.createCPFComAtributoT();
	    	cpfT.setNumero(cpf.getNumero());
	    	cpfT.setTipo(cpf.getTipo());
			return cpfT;
		}
	    
	    
		public void setCpf(CPFComAtributo cpf) {
			this.cpf = cpf;
		}
		public CertidaoNascimentoComAtributoT getCertidaoNascimentoComAtributoT() {
			ObjectFactory obj = new ObjectFactory();
			CertidaoNascimentoComAtributoT certidao = obj.createCertidaoNascimentoComAtributoT();
			certidao.setNumero(certidaoNascimentoComAtributo.getNumero());
			certidao.setTipo(certidaoNascimentoComAtributo.getTipo());
			return certidao;
		}
		
		
		public CertidaoNascimentoComAtributo getCertidaoNascimentoComAtributo() {
			return certidaoNascimentoComAtributo;
		}
		public void setCertidaoNascimentoComAtributo(CertidaoNascimentoComAtributo certidaoNascimentoComAtributo) {
			this.certidaoNascimentoComAtributo = certidaoNascimentoComAtributo;
		}
		public PISPASEPComAtributo getPispasepComAtributo() {
			return pispasepComAtributo;
		}
		
		public PISPASEPComAtributoT getPispasepComAtributoT() {
			ObjectFactory obj = new ObjectFactory();
			PISPASEPComAtributoT pis = obj.createPISPASEPComAtributoT();
			pis.setNumero(pispasepComAtributo.getNumero());
			pis.setTipo(pispasepComAtributo.getTipo());
			return pis;
		}
		public void setPispasepComAtributo(PISPASEPComAtributo pispasepComAtributo) {
			this.pispasepComAtributo = pispasepComAtributo;
		}
		public RGComAtributo getRgComAtributo() {
			return rgComAtributo;
		}
		
		public RGComAtributoT getRgComAtributoT() {
			ObjectFactory obj = new ObjectFactory();
			RGComAtributoT rg = obj.createRGComAtributoT();
			rg.setNumero(rgComAtributo.getNumero());
			rg.setTipo(rgComAtributo.getTipo());
			return rg;
		}
		public void setRgComAtributo(RGComAtributo rgComAtributo) {
			this.rgComAtributo = rgComAtributo;
		}
	    
	    
	    


}
