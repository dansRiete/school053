import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  Validators,
  AbstractControl, FormControl
} from '@angular/forms';
import {Http} from "@angular/http";

function skuValidator(control: FormControl): { [s: string]: boolean } {
  if (!control.value.match(/^123/)) {
    return {invalidSku: true};
  }
}

@Component({
  selector: 'app-demo-form-with-validations-explicit',
  template: `
    <div class="ui raised segment" style="width: 40%; margin-top: 15pt; margin-left: 50pt">

      <h2 class="ui header">Demo Form</h2>

      <form [formGroup]="myForm" (ngSubmit)="onSubmit(myForm.value)" class="ui form">

        <div class="field" [class.error]="!sku.valid && sku.touched">
          <label for="skuInput">Some field</label>
          <input type="text" id="skuInput" placeholder="Value" [formControl]="sku">
          <div *ngIf="!sku.valid && sku.touched" >Value must start from '123'</div>
          <div *ngIf="sku.hasError('required') && sku.touched" >Value is required</div>
        </div>

        <div *ngIf="!myForm.valid && myForm.touched" >Form is invalid</div>

        <button type="submit" class="ui button" >Submit</button>

      </form>
    </div>
  `
})

export class DemoFormComponent implements OnInit {

  myForm: FormGroup;
  sku: AbstractControl;

  constructor(fb: FormBuilder) {
    this.myForm = fb.group({
      'sku':  ['',  Validators.compose([
        Validators.required, skuValidator])]
    });

    this.sku = this.myForm.controls['sku'];
  }

  onSubmit(value: string): void {
    if (this.sku.valid) {
    console.log('you submitted value: ', value);
    }
    }

  ngOnInit(): void {
  }

}
