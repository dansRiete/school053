/**
 * Created by Aleks on 21.08.2017.
 */
export class Parent {
  id: string;
  lastName: string;
  firstName: string;
  patronymic: string;
  nickname: string;
  email: string;
  // phone: string;
  job: string;

  constructor(id: string, lastName: string, firstName: string, patronymic: string, nickname: string, email: string, job: string) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
    this.patronymic = patronymic;
    this.nickname = nickname;
    this.email = email;
    this.job = job;
  }
}
