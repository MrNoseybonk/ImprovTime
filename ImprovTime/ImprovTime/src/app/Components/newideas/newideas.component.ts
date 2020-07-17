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

  newItem: number;
  activity: string;
  character: string;
  setting: string;
  actMessage: string;
  charMessage: string;
  setMessage: string;
  actMade: boolean;
  charMade: boolean;
  setMade: boolean;

  constructor(private newideasService: NewideasService) { }

  ngOnInit(): void {
    this.actMade = false;
    this.charMade = false;
    this.setMade = false;
  }

  addActivity(){
    this.activitySub = this.newideasService
    .addActivity(this.activity)
    .subscribe((resp) => {
      alert('Activity added! Id number ' + resp + '.');
      if (this.actMade === false)
      {
        this.actMade = true;
      }
    },
    message => {
      if (message.status === 499)
      {
        alert('The activity ' + this.activity + ' already exists.');
      }
      else
      {
        alert('That activity wasn\'t added successfully.');
      }
    });

    this.activity = '';
  }

  addCharacter(){
    this.characterSub = this.newideasService
    .addCharacter(this.character)
    .subscribe((resp) => {
      alert('Character added! Id number ' + resp + '.')
      if (this.charMade === false)
      {
        this.charMade = true;
      }
    },
    message => {
      if (message.status === 499)
      {
        alert('The character ' + this.character + ' already exists.');
      }
      else
      {
        alert('That character wasn\'t added successfully.');
      }
    });

    this.character = '';
  }

  addSetting(){
    this.settingSub = this.newideasService
    .addSetting(this.setting)
    .subscribe((resp) => {
      alert('Setting added! Id number ' + resp + '.')
      if (this.setMade === false)
      {
        this.setMade = true;
      }
    },
    message => {
      if (message.status === 499)
      {
        alert('The setting ' + this.setting + ' already exists.');
      }
      else
      {
        alert('That setting wasn\'t added successfully.');
      }
     });

     this.setting = '';
  }

  ngOnDestroy() {
    if (this.actMade === true)
    {
      this.activitySub.unsubscribe();
    }

    if (this.charMade === true)
    {
      this.characterSub.unsubscribe();
    }

    if (this.setMade === true)
    {
      this.settingSub.unsubscribe();
    }
  }
}
