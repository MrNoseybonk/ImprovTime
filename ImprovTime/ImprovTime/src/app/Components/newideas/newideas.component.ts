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

  constructor(private newideasService: NewideasService) { }

  ngOnInit(): void {
  }

  addActivity(){
    console.log(this.activity);
    this.activitySub = this.newideasService
    .addActivity(this.activity)
    .subscribe((resp) => {});
  }

  addCharacter(){
    console.log('New Character');
  }

  addSetting(){
    console.log('New Setting');
  }
}
