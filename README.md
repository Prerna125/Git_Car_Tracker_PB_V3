Develop following REST endpoints for ingestion from: [http://mocker.egen.io]
Load vehicle details in bulk via a PUT /vehicles endpoint.
If the vehicle with same VIN is already present, update the record in db.
Ingest readings from these vehicles via a POST /readings.


Create alerts with given priority when following rules are triggered
Rule: engineRpm > readlineRpm, Priority: HIGH
Rule: fuelVolume < 10% of maxFuelVolume, Priority: MEDIUM
Rule: tire pressure of any tire < 32psi || > 36psi , Priority: LOW
Rule: engineCoolantLow = true || checkEngineLightOn = true, Priority: LOW


Develop User Interface with following features
Ability to see details of all the vehicles like VIN, make, model, year etc.
Show number of HIGH alerts within last 2 hours for all the vehicles and ability to sort list of vehicles based on it.
Ability to plot vehicle's history of specific signal over a user selected time range, e.g. fuelVolume over 2 hours, engineRpm over last 15minutes.
Ability to show vehicle's geolocation within last 30minutes on a map.
Ability to list a vehicle's all historical alerts.
OPTIONAL: Ability to send an email to the user when HIGH alerts are triggered for a vehicle.