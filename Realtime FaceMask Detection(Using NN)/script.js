let video;
let videoSize = 64;
let isVideoLoaded = false;
let myCanvas;
let myModel;
let label = '';
let custom=0;
let mask,nomask;
let savedata,savemodel;
let trainyourdata;

function setup() {
  custom = prompt("Enter 0 if You want to use my Custom Pretained Model for Live mask detector.1 If you want to train Yourself");
  myCanvas = createCanvas(600, 500);
  myCanvas.position(300,220);
  video = createCapture(VIDEO, videoReady);
  video.size(videoSize, videoSize);
  video.hide();

  let options = {
    inputs: [64, 64, 4],
    task: 'imageClassification',
    debug: true,
  };
  let modelInfo={
    model:'model(2).json',
    metadata:'model_meta(2).json',
    weights:'model.weights(2).bin'
  }
  myModel = ml5.neuralNetwork(options);


  if(custom==0)
  {
     myModel.load(modelInfo,()=>{
    console.log("model loaded");
    finishedTraining();
  })
  }
  else if(custom==1)
  {
    mask = createButton('Mask');
  nomask = createButton('No Mask');
  savedata = createButton('Save Data');
  savemodel = createButton('Save your Trained Model');
  trainyourdata = createButton('Train Your Model');
  mask.position(220,180);
  nomask.position(320,180);
  savedata.position(450,180);
  savemodel.position(580,180);
  trainyourdata.position(800,180);


  trainyourdata.mousePressed(()=>{
    myModel.normalizeData();
    myModel.train({epochs:50}, finishedTraining);
  })
  savedata.mousePressed(()=>{
    myModel.saveData();
  })
  savemodel.mousePressed(()=>{
    myModel.save();
  })

  mask.mousePressed(()=>{
    addCurrentData("Mask..keep wearing it");
  })
  nomask.mousePressed(()=>{
    addCurrentData("No Mask !!! Wear It");
  })
  }
}

function finishedTraining() {
  console.log('training complete');
  predictForMe();
}

function predictForMe() {
  let current = {
    image: video,
  };
  myModel.classify(current, showResult);
}

function showResult(error, results) {
  if (error) {
    return;
  }
  label = results[0].label;
  console.log(label);
  predictForMe();
}


function addCurrentData(label) {
  let current = {
    image: video,
  };
  let target = {
    label,
  };
  console.log('Adding example: ' + label);
  myModel.addData(current, target);
}

function videoReady() {
  isVideoLoaded = true;
}

function draw() {
  background(0);
  rectangle();
    image(video, 0, 0, width, height);
  textSize(45);
  textAlign(CENTER, CENTER);
  fill('red');
  text(label,300,60);
  
}
function rectangle() {
  stroke(255);
  fill(255,255,255,100);
  rect(70,70,60,60,10);
}