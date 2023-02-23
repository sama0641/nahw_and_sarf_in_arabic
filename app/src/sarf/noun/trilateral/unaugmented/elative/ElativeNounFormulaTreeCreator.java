
package sarf.noun.trilateral.unaugmented.elative;

import org.apache.commons.digester3.*;
import java.io.*;


public class ElativeNounFormulaTreeCreator {
    private ElativeNounFormulaTreeCreator() {
    }

    public static ElativeNounFormulaTree buildNounFormulaTree(File xmlDiagramFile) throws Exception{
        Digester digester = new Digester();
        digester.setValidating( false );

        digester.addObjectCreate("formulas", ElativeNounFormulaTree.class );

        digester.addObjectCreate("formulas/formula", ElativeNounFormula.class );
        digester.addSetProperties("formulas/formula", "c1","c1" );
        digester.addSetProperties("formulas/formula", "c2","c2" );
        digester.addSetProperties("formulas/formula", "c3", "c3" );

        digester.addSetNext( "formulas/formula" , "addFormula" );

        return (ElativeNounFormulaTree)digester.parse(xmlDiagramFile);
    }

}
