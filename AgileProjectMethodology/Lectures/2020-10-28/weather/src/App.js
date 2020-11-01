import React, { useState } from 'react';
import './App.css';
import sun from './shared/images/sol.jpeg'
import cloud from './shared/images/cloud.png'
import rain from './shared/images/regn.jpg'
import snow from './shared/images/snow.jpg'

function App() {
    const [age, setAge] = useState(-1);
    const [sortOfWheater, setSortOfWheater] = useState("");
    const [temperature, setTemperature] = useState(-1);
    const [adviceToday, setAdviceToday] = useState("Att tänka på idag");
    const [adviceList, setAdviceList] = useState(
        <ul className='list ulList'>
            <li>q</li><li>a</li><li>z</li><li>w</li><li>s</li>
        </ul>
    );

    const weatherSorts = ["Sol", "Regn", "Snö"]

    const ageIsSetTo = () => {
        if (age !== 0) {
            return age;
        } else {
            return 'undefined';
        }
    }

    const setAge0 = () => {
        whatAgeRangeHaveTheChild(0)
    }

    const setAge1 = () => {
        whatAgeRangeHaveTheChild(1)
    }

    const setAge2 = () => {
        whatAgeRangeHaveTheChild(2)
    }

    const whatAgeRangeHaveTheChild = (ageSpan) => {
        if (ageSpan === 0) {
            setAge('0-1');
        } else if (ageSpan === 1) {
            setAge('1-5');
        } else if (ageSpan === 2) {
            setAge('5-12');
        } else {
            setAge(undefined);
        }
    }

    function getRandomInt(max) {
        return Math.floor(Math.random() * Math.floor(max));
    }

    const getTemperature = () => {
        setTemperature(getRandomInt(40) - 20);
    }

    const getWeather = () => {
        setSortOfWheater(weatherSorts[getRandomInt(3)]);
    }

    const updateWeather = () => {
        getTemperature()
        getWeather()
        if (sortOfWheater === "Snö") {
            if (temperature > 0) {
                setTemperature(temperature - 20);
            }
        } else if (sortOfWheater === "Regn") {
            if (temperature < 0) {
                setTemperature(temperature + 20);
            }
        }
    }

    const setPicture = () => {
        if (sortOfWheater === "Sol") {
            return <img src={ sun } alt=""/>
        } else if (sortOfWheater === "Regn") {
            return <img src={ rain } alt=""/>
        } else if (sortOfWheater === "Snö") {
            return <img src={ snow } alt=""/>
        } else if (sortOfWheater === "Molnigt") {
            return <img src={ cloud } alt=""/>
        }
    }

    const decideAndUpdateWeather = () => {
        if (temperature < 0 && sortOfWheater === "Sol") {
            return <p>Viktigt att barnet är varmt, känn på nacke eller panna. Bör inte kännas kall men inte heller svettas.</p>
        } else if (temperature < 0 && sortOfWheater === "Regn") {
            return <p>Viktigt att barnet är varmt, känn på nacke eller panna. Bör inte kännas kall men inte heller svettas.</p>
        } else if (temperature < 0 && sortOfWheater === "Snö") {
            return <p>Viktigt att barnet är varmt, känn på nacke eller panna. Bör inte kännas kall men inte heller svettas.</p>
        } else if ((temperature >= 0 && temperature < 15) && sortOfWheater === "Sol") {
            return <p>Ofodrade skor, tunn jacka, eller lätt fodrad jacka</p>
        } else if ((temperature >= 0 && temperature < 15) && sortOfWheater === "Regn") {
            return <p>Galonbyxor samt regnjacka, mössa eller sydväst, gummistövlar </p>
        } else if ((temperature >= 0 && temperature < 15) && sortOfWheater === "Snö") {
            return <p>Galonbyxor samt regnjacka, mössa eller sydväst, gummistövlar </p>
        } else if (sortOfWheater === "Sol") {
            return <p>Ofodrade skor, tunn jacka, eller lätt fodrad jacka </p>
        } else if (sortOfWheater === "Regn") {
            return <p>Regn jacka,mycket tunnt underställ </p>
        } else if (sortOfWheater === "Snö") {
            return <p>Regn jacka,mycket tunnt underställ </p>
        }
    }

    return (
        <div className='tc'>
            <h1 className='ma2 pa2 f1'>Kläder efter väder app</h1>
            <div className='bg-lightest-blue br3 pa3 grow bw2 shadow-5 boxSize'>
                <h2>Ålder:</h2>
                <button className='grow' onClick={ setAge0 }>0-1</button>
                <button className='grow' onClick={ setAge1 }>1-5</button>
                <button className='grow' onClick={ setAge2 }>5-12</button>

                <h2>Barnets ålder är satt till { ageIsSetTo() }</h2>
            </div>
            <div className='bg-lightest-blue br3 pa3 grow bw2 shadow-5 boxSize'>
                <h2>Väder</h2>
                <button className='grow' onClick={ updateWeather }>Hämta väder</button>
                <br/>
                <span>
                    { sortOfWheater }, { temperature } grader
                </span>
                <br/>
                { setPicture() }
            </div>
            <div className='bg-lightest-blue br3 pa3 grow bw2 shadow-5 boxSize'>
                <h2>Klädvalsrekommendation</h2>
                <h3>Generellt råd</h3>
                <p>{ adviceToday }</p>
                {decideAndUpdateWeather()}
            </div>

            {/*<h3>Age span is { whatAgeRangeHaveTheChild() }</h3>*/ }
        </div>
    );
}

export default App;
