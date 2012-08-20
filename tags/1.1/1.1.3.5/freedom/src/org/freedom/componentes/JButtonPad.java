/**
 * @version 04/06/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 * 
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.componentes <BR>
 * Classe:
 * @(#)JButtonPad.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para
 * Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste
 * Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc�
 * pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa �
 * preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios da classe.....
 */

package org.freedom.componentes;

import java.awt.Cursor;

import javax.swing.DefaultButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;

public class JButtonPad extends JButton {

	private static final long serialVersionUID = 1L;

	private int iCodSys = 0;

	private int iCodMod = 0;

	private int iCodIt = 0;

	private Class tela = null;

	private String titulo = "";

	public int getICodIt() {
		return iCodIt;
	}

	public int getICodMod() {
		return iCodMod;
	}

	public int getICodSys() {
		return iCodSys;
	}

	public Class getTela() {
		return tela;
	}

	public String getTitulo() {
		return titulo;
	}

	//private int iCodNiv = 0;

	public JButtonPad(Icon icon) {
        this(null, icon);
    }
	
    public JButtonPad(String text, Icon icon) {
        // Create the model
    	this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setModel(new DefaultButtonModel());
        // initialize
        init(text, icon);
    }
	
	/**
	 * Construtor da classe JButtonPad(). <BR>
	 *  
	 */

	public JButtonPad() {
		this(0, 0, 0, null, "");
	}

	/**
	 * Construtor da classe JButtonPad(). <BR>
	 * Construtor que ja ajusta os paramatros basicos do JButtonPad.
	 * @param tela Tela que receber� o bot�o.
	 * @param titulo T�tulo do bot�o.
	 *  
	 */

	public JButtonPad(int iCodSistema, int iCodModulo, int iCodItem, Class tela, String titulo) {
		iCodSys = iCodSistema;
		iCodMod = iCodModulo;
		iCodIt = iCodItem;
		this.tela = tela;
		this.titulo = titulo;
		//iCodNiv = iCodNivel;

	}

	/**
	 * Ajusta o c�digo do sistema. <BR>
	 * 
	 * @param iCod -
	 *            C�digo do sistema.
	 * @see #getCodSistema
	 *  
	 */

	public void setCodSistema(int iCod) {
		iCodSys = iCod;
	}

	/**
	 * Retorna o c�digo do sistema. <BR>
	 * 
	 * @return C�digo do sistema ou zero se o c�digo n�o foi definido.
	 * @see #setCodSistema
	 *  
	 */

	public int getCodSistema() {
		return iCodSys;
	}

	/**
	 * Ajusta o c�digo do m�dulo do sistema. <BR>
	 * 
	 * @param iCod -
	 *            C�digo do m�dulo.
	 * @see #getCodModulo
	 *  
	 */

	public void setCodModulo(int iCod) {
		iCodMod = iCod;
	}

	/**
	 * Retorna o c�digo do m�dulo do sistema. <BR>
	 * 
	 * @return C�digo do m�dulo ou zero se o c�digo n�o foi definido.
	 * @see #setCodModulo
	 *  
	 */

	public int getCodModulo() {
		return iCodMod;
	}

	/**
	 * Ajusta o c�digo do item. <BR>
	 * O c�digo do item � composto da seguinte forma: <BR>
	 * 8 casas decimais (caso as casas da direita n&atildeo forem usadas colocar
	 * 0)<BR>
	 * e mais uma unidade para detalhamentos longos. agrupadas de dois em dois,
	 * ex: 19|26|03|17|8. <BR>
	 * <BR>
	 * No exemplo o c�digo do menu principal �: 19 <BR>
	 * submenu1: 26 <BR>
	 * submenu2: 03 <BR>
	 * submenu3: 17 <BR>
	 * item: 8 <BR>
	 * 
	 * @param iItem -
	 *            C�digo do item.
	 * @see #getCodItem
	 *  
	 */

	public void setCodItem(int iCod) {
		iCodIt = iCod;
	}

	/**
	 * Retorna o c�digo do item.
	 * 
	 * @return C�digo do item ou zero se o c�digo n�o foi definido.
	 * @see #setCodItem
	 *  
	 */

	public int getCodItem() {
		return iCodIt;
	}

}