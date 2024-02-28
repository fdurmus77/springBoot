import React from 'react'
import PropTypes from 'prop-types';

function User(props) {
    console.log(props.friends);
    return (
        <div> <h2> User </h2>
            <div>İsim: {props.name}</div>
            <div>Şehir: {props.city}</div>
            <div>Plaka Şehir: {props.plate}</div>
            <hr />
            {
                props.friends.map((friend, i) => (<div key={i}> {friend}</div>))
            }
            <hr />
        </div>
    )
}
// prop tiplerini beliler yukardaki import ile
User.propTypes = {
    name: PropTypes.string.isRequired,
    age: PropTypes.number,
    city: PropTypes.string,
    friends: PropTypes.array,
};

// Propslara default değerler verilebilir required oldabile bunu doldurur
User.defaultProps = {
friends: [],
};

export default User