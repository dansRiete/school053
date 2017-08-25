import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ChildTableComponent } from './child-table/child-table.component';
import {
  DemoFormComponent
} from './demo-form/demo-form';
import {
 FormsModule,
   ReactiveFormsModule
 } from '@angular/forms';
import { NavigationComponent } from './navigation/navigation.component';
import {
 RouterModule, Routes
} from '@angular/router';
import {LocationStrategy, HashLocationStrategy} from '@angular/common';
import { SchoolClassTableComponent } from './school-class-table/school-class-table.component';
import { AddClassComponent } from './add-class-form/add-class.component';
import {HttpModule} from '@angular/http';
import {AppService} from './app.service';
import { ParentsDropdownComponent } from './parents-dropdown/parents-dropdown.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MD_PLACEHOLDER_GLOBAL_OPTIONS} from '@angular/material';
import {MdAutocompleteModule,
  MdButtonModule,
  MdButtonToggleModule,
  MdCardModule,
  MdCheckboxModule,
  MdChipsModule,
  MdCoreModule,
  MdDatepickerModule,
  MdDialogModule,
  MdExpansionModule,
  MdGridListModule,
  MdIconModule,
  MdInputModule,
  MdListModule,
  MdMenuModule,
  MdNativeDateModule,
  MdPaginatorModule,
  MdProgressBarModule,
  MdProgressSpinnerModule,
  MdRadioModule,
  MdRippleModule,
  MdSelectModule,
  MdSidenavModule,
  MdSliderModule,
  MdSlideToggleModule,
  MdSnackBarModule,
  MdSortModule,
  MdTableModule,
  MdTabsModule,
  MdToolbarModule,
  MdTooltipModule} from '@angular/material';
import { CdkTableModule } from '@angular/cdk/table';

const routes: Routes = [
  { path: '', redirectTo: 'children', pathMatch: 'full' },
  { path: 'children', component: ChildTableComponent },
  { path: 'form', component: DemoFormComponent },
  { path: 'classes', component: SchoolClassTableComponent},
  { path: 'addClass', component: AddClassComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    ChildTableComponent,
    DemoFormComponent,
    NavigationComponent,
    ParentsDropdownComponent,
    NavigationComponent,
    SchoolClassTableComponent,
    AddClassComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(routes),
    FormsModule, // <-- add this
    ReactiveFormsModule, // <-- and this
    MdSelectModule, MdTableModule, CdkTableModule, MdToolbarModule, MdTabsModule, MdButtonModule,
    HttpModule, CdkTableModule,
    MdAutocompleteModule,
    MdButtonModule,
    MdButtonToggleModule,
    MdCardModule,
    MdCheckboxModule,
    MdChipsModule,
    MdCoreModule,
    MdDatepickerModule,
    MdDialogModule,
    MdExpansionModule,
    MdGridListModule,
    MdIconModule,
    MdInputModule,
    MdListModule,
    MdMenuModule,
    MdNativeDateModule,
    MdPaginatorModule,
    MdProgressBarModule,
    MdProgressSpinnerModule,
    MdRadioModule,
    MdRippleModule,
    MdSelectModule,
    MdSidenavModule,
    MdSliderModule,
    MdSlideToggleModule,
    MdSnackBarModule,
    MdSortModule,
    MdTableModule,
    MdTabsModule,
    MdToolbarModule,
    MdTooltipModule,
  ],
  providers: [
    { provide: LocationStrategy, useClass: HashLocationStrategy },
    {provide: AppService, useClass: AppService}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
