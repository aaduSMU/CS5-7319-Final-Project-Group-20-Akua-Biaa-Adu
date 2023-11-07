
var createWorker = function ()
{
    var workCounter = 0;

    var task1 = function(){
        workCounter +=1;
        console.log("task 1" + workCounter);

    }

    var task2 = function(){
        workCounter +=1;
        console.log("task 2" + workCounter);

    }

    return {
        job1: task1,
        job2: task2
    }
}

var worker = createWorker();

worker.job1();
worker.job2();
worker.job1();
worker.job1();
