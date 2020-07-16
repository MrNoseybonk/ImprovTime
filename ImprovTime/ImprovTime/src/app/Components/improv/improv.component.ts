import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { ImprovService } from 'src/app/improv.service';

@Component({
  selector: 'app-improv',
  templateUrl: './improv.component.html',
  styleUrls: ['./improv.component.css']
})
export class ImprovComponent implements OnInit, OnDestroy {
  private improvSub: Subscription;

  sceneData: any;
  characterData: any[];
  activityData: any;
  settingData: any;

  constructor( private improvService: ImprovService) { }

  ngOnInit(): void {
    this.newScene();
}

  newScene(){
    this.improvSub = this.improvService
      .getImprov()
      .subscribe((resp) => {
        this.sceneData = resp;

        this.characterData = [];

        this.activityData = this.sceneData.activity;
        this.settingData = this.sceneData.setting;

        for (const character of this.sceneData.characters)
        {
          this.characterData.push(character);
        }
    });
  }

  ngOnDestroy() {
    this.improvSub.unsubscribe();
  }
}
