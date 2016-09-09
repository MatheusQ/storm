/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author j155993
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Joseffer
 */
/**
 *
 * @author joseffer
 */
public abstract class Arquivo implements Serializable {

    public void Save() throws FileNotFoundException, IOException {
        File arquivo = new File(this.ArquivoNome());
//        System.out.print(arquivo.getAbsolutePath());

        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs();
            arquivo.createNewFile();
        }

        FileOutputStream arquivoS = new FileOutputStream(arquivo);
        ObjectOutputStream saida = new ObjectOutputStream(arquivoS);
        saida.writeObject(this);
        saida.close();
        arquivoS.close();
    }

    protected <T> T LoadFile(File arquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        T t;

        FileInputStream arquivoE = new FileInputStream(arquivo);
        ObjectInputStream entrada = new ObjectInputStream(arquivoE);
        t = (T) entrada.readObject();
        entrada.close();
        arquivoE.close();

        return t;
    }

    /**
     *
     * @param <T>
     * @return
     */
    protected <T> ArrayList<T> LoadAllFiles() throws IOException, FileNotFoundException, ClassNotFoundException, IllegalArgumentException {
        ArrayList<T> objetos = new ArrayList<T>();
        File diretorio = new File(DiretorioNome());
        File[] arquivos = diretorio.listFiles();
        System.out.println(diretorio.getAbsolutePath());
        try {
            for (File f : arquivos) {
                objetos.add((T) LoadFile(f));
            }
        } catch (Exception e) {
            System.out.println("Erro - " + e);
        }

        return objetos;
    }

    public void Remove() {
        File arquivo = new File(ArquivoNome());
        if (arquivo.exists()) {
            arquivo.delete();
        }
    }

    protected abstract String ArquivoNome();

    protected abstract String DiretorioNome();

    public abstract <T> ArrayList<T> LoadAll();

    public abstract <T> T Load(String f);

}

