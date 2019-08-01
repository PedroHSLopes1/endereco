/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.EnderecoDao;
import javax.swing.JOptionPane;
import modelo.Endereco;
import tela.telaManutencao;
import tela.telaManutencao;

/**
 *
 * @author Administrador
 */
public class ControladorEndereco {

    public static void inserir(telaManutencao man) {
        Endereco objeto = new Endereco();
        objeto.setComplemento(man.jtfComplemento.getText());
        objeto.setBairro(man.jtfBairro.getText());
        objeto.setLogradouro(man.jtfLogradouro.getText());
        boolean resultado = EnderecoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void alterar(telaManutencao aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void excluir(telaManutencao aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public static void alterar(ManutencaoEndereco man){
        Endereco objeto = new Endereco();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setDescricao(man.jtfDescricao.getText());
        
        boolean resultado = DaoEndereco.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
