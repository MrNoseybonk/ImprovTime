import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { NewideasService } from 'src/app/newideas.service';

@Component({
  selector: 'app-newideas',
  templateUrl: './newideas.component.html',
  styleUrls: ['./newideas.component.css']
})
export class NewideasComponent implements OnInit {
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

  constructor(private newideasService: NewideasService) { }

  ngOnInit(): void {
  }

  addActivity(){
    console.log(this.activity);
    this.activitySub = this.newideasService
    .addActivity(this.activity)
    .subscribe((resp) => { this.actMessage = 'Activity added! Id number ' + resp + '.'; },
    message => { console.log(message); });
  }

  addCharacter(){
    console.log(this.character);
    this.characterSub = this.newideasService
    .addCharacter(this.character)
    .subscribe((resp) => { this.charMessage = 'Character added! Id number ' + resp + '.'; },
    message => { console.log(message); });
  }

  addSetting(){
    console.log(this.setting);
    this.settingSub = this.newideasService
    .addSetting(this.setting)
    .subscribe((resp) => { this.setMessage = 'Setting added! Id number ' + resp + '.'; },
    message => { console.log(message); });
  }
}
