/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

/**
 * inisiasi enum
 */
public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");

    private String text;

    /**
     * constructor enum
     * @param
     */
    JobCategory(String text){
        this.text = text;
    }

    /**
     * method menampilkan kategori
     */
    public String toString(){
        return text;
    }
}

