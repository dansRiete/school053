export class SchoolClass {
  id: string;
  name: string;
  curatorLastName: string;
  curatorFirstName: string;

  constructor(id: string, name: string, curatorLastName: string, curatorFirstName: string) {
    this.id = id;
    this.name = name;
    this.curatorLastName = curatorLastName;
    this.curatorFirstName = curatorFirstName;
  }
}
