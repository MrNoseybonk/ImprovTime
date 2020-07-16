import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { NewideasService } from 'src/app/newideas.service';

@Component({
  selector: 'app-newideas',
  templateUrl: './newideas.component.html',
  styleUrls: ['./newideas.component.css']
})
export class NewideasComponent implements OnInit, OnDestroy {
  private activitySub: Subscription;
  private characterSub: Subscription;
  private settingSub: Subscription;

  errorDialog = document.getElementById('error-box');

  newItem: number;
  activity: string;
  character: string;
  setting: string;
  actMessage: string;
  charMessage: string;
  setMessage: string;

  constructor(private newideasService: NewideasService) { }

  ngOnInit(): void {
  }

  addActivity(){
    console.log(this.activity);
    this.activitySub = this.newideasService
    .addActivity(this.activity)
    .subscribe((resp) => { this.actMessage = 'Activity added! Id number ' + resp + '.'; },
    message => {
      if (message.status === 400)
      {
        alert('That activity already exists.');
      }
      else
      {
        alert('That activity wasn\'t added successfully.');
      }
    });
  }

  addCharacter(){
    console.log(this.character);
    this.characterSub = this.newideasService
    .addCharacter(this.character)
    .subscribe((resp) => { this.charMessage = 'Character added! Id number ' + resp + '.'; },
    message => {
      if (message.status === 400)
      {
        alert('That character already exists.');
      }
      else
      {
        alert('That character wasn\'t added successfully.');
      }
    });
  }

  addSetting(){
    console.log(this.setting);
    this.settingSub = this.newideasService
    .addSetting(this.setting)
    .subscribe((resp) => { this.setMessage = 'Setting added! Id number ' + resp + '.'; },
    message => {
      if (message.status === 400)
      {
        alert('That setting already exists.');
      }
      else
      {
        alert('That setting wasn\'t added successfully.');
      }
     });
  }

  ngOnDestroy() {
    this.activitySub.unsubscribe();
    this.characterSub.unsubscribe();
    this.settingSub.unsubscribe();
  }
}
