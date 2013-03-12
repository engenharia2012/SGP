/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Avell
 */
public class GeraBanco {
    public static void main(String[] args){
        try{
        AnnotationConfiguration conf = new AnnotationConfiguration();
        conf.configure();
        SchemaExport se = new SchemaExport(conf);      


        se.create(true,true);
        //se.execute(true, true, true, true);

        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
  }
}
