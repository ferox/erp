/**
 * @version 12/05/2003 <BR>
 * @author Setpoint Informática Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.acao <BR>
 * Classe: @(#)EditEvent.java <BR>
 * 
 * Este arquivo é parte do sistema Freedom-ERP, o Freedom-ERP é um software livre; você pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licença Pública Geral GNU como publicada pela Fundação do Software Livre (FSF); <BR>
 * na versão 2 da Licença, ou (na sua opnião) qualquer versão. <BR>
 * Este programa é distribuido na esperança que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUAÇÂO a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. <BR>
 * Veja a Licença Pública Geral GNU para maiores detalhes. <BR>
 * Você deve ter recebido uma cópia da Licença Pública Geral GNU junto com este programa, se não, <BR>
 * escreva para a Fundação do Software Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA <BR> <BR>
 *
 * Comentários da classe.....
 */

package org.freedom.acao;

import org.freedom.library.persistence.ListaCampos;

public class EditEvent {
	private ListaCampos lcCampos = null;
	private Object oSrc = null;
	public boolean ok = false;

	public EditEvent(ListaCampos lc) {
		//System.out.println(lc.getNomeTabela());
		//System.out.println()
		lcCampos = lc;
		oSrc = lc;
	}

	public EditEvent(Object sr) {
		oSrc = sr;
	}

	public ListaCampos getListaCampos() {
		return lcCampos;
	}

	public int getEstado() {
		return lcCampos.getStatus();
	}

	public void cancela() {
		lcCampos.cancelEdit();
	}

	public Object getSource() {
		return oSrc;
	}
}
