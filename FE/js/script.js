    let newGet = {id: 2}
    function findd(){
        fetch("http://localhost:8080/GetWorkerByID/1",{
            method: 'get'
        })
        
    .then(response=>{
        return response.json()
    }).then(json=>{
        const obj = JSON.parse(JSON.stringify(json));
        console.log(obj);
        document.getElementById('nameData').innerHTML=obj.name + " " + obj.surename;
        document.getElementById('nadpis1').innerHTML=obj.jobs[0].companyName;
    })
        
     }