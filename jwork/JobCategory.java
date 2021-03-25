enum JobCategory
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
    
    JobCategory(String text){
        this.text = text;
}
    
    @Override
    public String toString(){
        return text;
    }
}

