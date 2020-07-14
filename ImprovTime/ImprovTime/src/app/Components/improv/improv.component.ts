import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { ImprovService } from 'src/app/improv.service';

@Component({
  selector: 'app-improv',
  templateUrl: './improv.component.html',
  styleUrls: ['./improv.component.css']
})
export class ImprovComponent implements OnInit {
  private improvSub: Subscription;

  sceneData: any;
  characterData: any[];
  activityData: any[];
  settingData: any[];

  constructor( private improvService: ImprovService) { }

  ngOnInit(): void {
    this.improvSub = this.improvService
      .getImprov()
      .subscribe((resp) => {
        this.sceneData = resp;

        console.log(this.sceneData);
  });
}

}
