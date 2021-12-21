/*let parties;
window.onload = fetchParties();

function fetchParties() {
    fetch(baseURL + "/parties")
        .then(response => response.json())
        .then(result => {
            console.log("!!!-----FEEECTHINGGGG-----!!!")
            parties = result
            for (let i = 0; i < parties.length; i++) {

                data.addRows(parties[i].name,parties[i].votes)
            }
            chart.draw(data, options);
        });
}
*/