DROP TABLE IF EXISTS API_EXCHANGERATES;
    
create table api_exchangerates(
        id INT not null,
        base_name varchar(255),
	rates_ofyear varchar(255),
	january varchar(255),
	february varchar(255),
	march varchar(255),      
	april varchar(255),
	may varchar(255),
	june varchar(255),
	july varchar(255),
        august varchar(255),
	september varchar(255),
	october varchar(255),
	november varchar(255),
	decmber varchar(255),
        primary key (id)
    )