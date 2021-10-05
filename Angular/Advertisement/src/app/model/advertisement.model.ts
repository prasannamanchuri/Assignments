export class Advertisement{
    id:number;
    Title:string;
    Name:string;
    Category:string;
    Description:string;

    constructor(id:number,Title:string,Name:string,Category:string,Description:string)
    {
        this.id=id;
        this.Title=Title;
        this.Name=Name;
        this.Category=Category;
        this.Description=Description
    }

    getTitle(){
        return this.Title;
    }

    getId(){
        return this.id;
    }
}