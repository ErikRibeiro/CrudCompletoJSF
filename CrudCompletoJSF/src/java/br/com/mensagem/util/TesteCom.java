
package br.com.mensagem.util;

import br.com.mensagem.DAO.MensagemDAO;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TesteCom {
    public static void main(String[] args) throws ClassNotFoundException {
       
            Connection conexao = (Connection) FabricaConexao.getConexao();
    }}