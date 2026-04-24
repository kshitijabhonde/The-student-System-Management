document.addEventListener("DOMContentLoaded", function () {

    const apiurl = "http://localhost:9012/student1/getall";
    const tableBody = document.getElementById("tableBody");

    fetch(apiurl)
        .then(response => response.json())
        .then(data => {

            data.forEach(student1 => {

                const row = document.createElement("tr");

                row.innerHTML = `
                    <td>${student1.id}</td>
                    <td>${student1.name}</td>
                    <td>${student1.city}</td>
                    <td>${student1.percentage}</td>
                `;

                tableBody.appendChild(row);

            });

        })
        .catch(error => {
            console.log("Error while API calling: " + error);
        });

});